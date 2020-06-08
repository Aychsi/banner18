from sys import exit
from random import randint
from textwrap import dedent

#For any scene, you should be able to enter it. That's why we have def enter(self)
class Scene(object):
    def enter(self):
        exit(1)

class Engine(object):
    def __init__(self, scene_map):
        self.scene_map = scene_map
    def play(self):
        current_scene = self.scene_map.opening_scene()
        last_scene = self.scene_map.next_scene('finished')

        #So this part is to go onto the next scene as long as it's not the last scene
        while current_scene != last_scene:
            #Change the name of the scene name to the next scene
            next_scene_name = current_scene.enter()
            current_scene = self.scene_map.next_scene(next_scene_name)

        current_scene.enter()

class Death(Scene):
    choices = [
        "You died. Please try again.",
        "Task failed unsuccessfully",
        "Another one bites the dust",
        "Strike 3, you're out!"
    ]
    def enter(self):
        while True:
            choices_rand = randint(0, len(self.choices)-1)
            print(Death.choices[choices_rand])
            print("Play again? Y or N")
            action = input("> ")

            # If they want to restart the game
            if action.upper() == "Y":
                a_game = Engine(a_map)
                a_game.play()
            elif action.upper() == "N":
                exit(1)
            else:
                print("Invalid input \n")

class CentralCorridor(Scene):
    def enter(self):
        print(dedent("""
            The Gothons of Planet Percal #25 have invaded your ship and destroyed your entire crew. You are the only 
            surviving member. Your mission, should you choose to accept it, it to get the neutron destruct bomb from 
            the weapons armory, put in the bridge, and blow up the ship after escaping in the escape pod.
            
            You're running down the central corridor to the weapons armory when a Gothon jumps out, red scaly skin, 
            dark grimy teeth, and evil LA Lakers jersey flowing around his hate filled body. He's blocking the door
            to the armory and about to pull a weapon to blast you. 
        """))

        print("Your options are: \nshoot! \ndodge! \ntell a joke!")
        action = input("> ")

        if action == "shoot!":
            correct = randint(1, 10)
            gothon_draw = randint(1,10)
            print(dedent("""
                    It's a draw! Choose a number between 1 to 10. If your number is closer to the correct number
                    than the Gothon, you win! 
                        """))
            try:
                action = int(input("> "))
                if abs(action-correct) < abs(gothon_draw-correct):
                    print(dedent("""
                            Quick on the draw, you shoot the alien before he shoots you!
                    """))
                    return 'laser_weapon_armory'
                else:
                    print(dedent("""
                            Too slow! The alien shoots you before you can pull out your gun!
                        """))
                    return 'death'
            except ValueError or NameError:
                print("Invalid input. Try again")
                return 'central_corridor'

        elif action == "dodge!":
            print(dedent("""
                    Like a world class boxer, you dodge, weave, slip, and slide right as the Gothon's blaster cranks a 
                    laser past your head. In the middle of your artful dodge, your foot slips and you bang your head on
                    the metal wall and pass out. You wake up shortly after only to die as the Gothon stomps on your head 
                    and eats you. 
                    """))
            return 'death'

        elif action == "tell a joke!":
            print(dedent("""
                    Lucky for you, they made you learn Gothon insults in the academy. You tell the one Gothon joke you
                    know: al;skjdf al;ksdjf a;lksdfj a;lsjf. The Gothon stops, tries not to laugh, then bursts out 
                    laughing and can't move. While he's laughing your run up and shoot him square in the head putting
                    him down, then jump through the weapon armory door.
                        """))
            return 'laser_weapon_armory'
        else:
            print("Does not compute. Please try another action.")
            return 'central_corridor'

class LaserWeaponArmory(Scene):
    def enter(self):
        print(dedent("""
            You do a dive roll into the weapon armory, crouch and scan the room for more Gothons that might be hiding.
            It's dead quiet, too quiet. You stand up and run to the far side of the room and find the neutron bomb in 
            its container. There's a keypad lock on the box and you need the code to get the bomb out. If you get the 
            wrong 10 times, then the lock closes forever and you can't get the bomb. The code is 3 digits.  
        """))
        code = int(f"{randint(1,9)}{randint(1,9)}{randint(1,9)}")
        guess = input("[keypad]> ")

        if guess == "cheat":
            return "the_bridge"

        guesses = 0


        while guess != code and guesses < 10:
            guesses += 1
            print(str(10 - guesses) + " attempts remaining")
            try:
                guess = int(input("[keypad]> "))

                # Kinda hard to guess a three digit number, so this will help
                if guess > code:
                    print("too high!")
                else:
                    print("too low!")

            except ValueError or NameError:
                print("Invalid input, please try again.")

        if guess == code:
            print(dedent("""
                Click! The seal breaks, letting gas out. You grab the neutron bomb and run as fast as you can to the 
                bridge where you must place it in the right spot. 
            """))
            return 'the_bridge'
        else:
            print(dedent("""
                The lock buzzes one last time and then you hear a sickening melting sound as the mechanism is fused 
                together. you decide to sit there, and finally the Gothons blow up the ship from their ship and you die.
            """))
            return 'death'


class TheBridge(Scene):
    def enter(self):
        print(dedent("""
            You burst onto the Bridge with the neutron destruct bomb under your arm and surprise 5 Gothons who are 
            trying to take control of the ship. Each of them has an even uglier Lakers jersey than the last. They 
            haven't pulled their weapons out yet, as they see the active bomb under your arm and don't want to set it 
            off.
        """))

        print("Your options are: \nThrow the bomb \nSlowly place the bomb")

        action = input("> ")
        if action == "Throw the bomb" :
            print(dedent("""
                In a panic, you throw the bomb at the group of Gothons and make a leap for the door. Right as you drop
                it a Gothon shoots you right in the back. As you die you see another Gothon frantically try to disarm
                the bomb. You die knowing they will probably blow up when it goes off.
            """))
            return 'death'

        elif action == "Slowly place the bomb":
            print(dedent("""
                You point your blaster at the bomb under your arm and the Gothons put their hands up and start to 
                sweat. You inch backward to the door, open it, and then carefully place the bomb on the floor, pointing 
                your blaster at it. You then jump back through the door, punch the close button and blast the lock so 
                the Gothons can't get out. Now that the bomb is placed, you run to the escape pod to get off this tin 
                can.
            """))
            return 'escape_pod'
        else:
            print("Does not compute. Try another command")
            return 'the_bridge'

class EscapePod(Scene):
    def enter(self):
        print(dedent("""
            You rush through the ship desperately trying to make it to the escape pod before the whole ship explodes.
            It seems like hardly any Gothons are on the ship, so your run is clear of interference. You get to the 
            chamber with the escape pods, and now need to pick one to take. Some of them could be damaged but you don't 
            have time to look. There are 5 pods. Which on do you take?
        """))
        good_pod =randint(1,5)
        guess = input("[pod #]> ")

        #We have to cast it as an integer first
        try:
            if int(guess) != good_pod:
                print(dedent("""
                    You jump into pod """ + guess + """ and hit the eject button. The pod escapes out into the void of space, then 
                    implodes as the hull ruptures, crushing your body into jam jelly
                """))
                return 'death'
            else:
                print(dedent("""
                    You jump into pod """ + guess + """ and hit the eject button. The pod easily slides out into the space heading to 
                    the planet below. As it flies to the planet, you look back and see your ship implode then explode like 
                    a bright star, taking out the Gothon ship at the same time. You won!
                """))
                return 'finished'
        except ValueError or NameError:
            print("Invalid input")
            return 'escape_pod'


class Finished(Scene):
    def enter(self):
        print("Victory!!!")
        return "finished"
        exit(1)

class Map(object):

    #Giving string names to all the scene classes using key value
    scenes = {
        'central_corridor': CentralCorridor(),
        'laser_weapon_armory': LaserWeaponArmory(),
        'the_bridge': TheBridge(),
        'escape_pod': EscapePod(),
        'death': Death(),
        'finished': Finished()
    }

    def __init__(self, start_scene):
        self.start_scene = start_scene
    #So if you call some next_scene(x) where x is a string, you would get the corresponding scene class
    #because we have linked each string scene to is corresponding scene class
    def next_scene(self, scene_name):
        val = Map.scenes.get(scene_name)
        return val
    def opening_scene(self):
        return self.next_scene(self.start_scene)

a_map = Map('central_corridor')
a_game = Engine(a_map)
a_game.play()
