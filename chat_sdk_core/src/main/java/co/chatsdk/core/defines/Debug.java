/*
 * Created by Itzik Braun on 12/3/2015.
 * Copyright (c) 2015 deluge. All rights reserved.
 *
 * Last Modification at: 3/12/15 4:27 PM
 */

package co.chatsdk.core.defines;

@Deprecated
public class Debug {

    /*Network*/
    public static final boolean FirebaseInterface = false;
    public static final boolean AbstractNetworkAdapter = false;
    public static final boolean AuthManager = false;
    public static final boolean FacebookManager = false;
    public static final boolean NetworkManager = false;
    public static final boolean TwitterManager = true;
    public static final boolean EventManager = false;
    public static final boolean Path = false;
    public static final boolean CoreManager = false;
    public static final boolean ThreadsManager = false;
    public static final boolean FirebaseNetworkAdapter = true;
    public static final boolean FirebaseUploadHandler = true;
    public static final boolean BackendlessPushHandler = true;
    public static final boolean StateManager = true;

    public static final boolean FirebaseAuthenticationHandler = true;
    public static final boolean AbstractAuthenticationHandler = true;


    /*Fragments*/
    private static final boolean FRAGMENTS = false;
    public static final boolean ContactsFragment = FRAGMENTS || false;
    public static final boolean ConversationsFragment = FRAGMENTS || false;
    public static final boolean ProfileFragment = FRAGMENTS || false;
    public static final boolean ThreadsFragment = FRAGMENTS || false;
    public static final boolean ExpandableContactsFragment = FRAGMENTS || false;

    /*DaoCore*/
    public static final boolean DaoCore = false;
    public static final boolean BMessage = false;
    public static final boolean BUser = false;
    public static final boolean BThread = false;

    /*Adapters*/
    public static final boolean MessagesListAdapter = false;
    public static final boolean ThreadsListAdapter = false;
    public static final boolean UsersWithStatusListAdapter = false;

    /*Activities*/
    public static final boolean BaseActivity = false;
    public static final boolean ChatActivity = false;
    public static final boolean LocationActivity = false;
    public static final boolean LoginActivity = true;
    public static final boolean MainActivity = false;
    public static final boolean PickFriendsActivity = false;
    public static final boolean SearchActivity = false;
    public static final boolean ShareWithContactsActivity = false;
    public static final boolean ThreadDetailsActivity = false;
    public static final boolean ChatSDKBaseThreadActivity = false;

    /*Utils*/
    public static final boolean ImageUtils = false;
    public static final boolean UiUtils = false;
    public static final boolean DialogUtils = false;

    /*Views*/
    public static final boolean ChatBubbleImageView = false;
    public static final boolean ChatMessageBoxView = false;

    /*Firebase - Listeners */
    public static final boolean IncomingMessagesListener = false;
    public static final boolean ThreadDetailsChangeListener = false;
    public static final boolean UserAddedToThreadListener = false;
    public static final boolean UserDetailsChangeListener = false;
    public static final boolean FollowerAddedListener = false;
    public static final boolean UserToFollowAddedListener = false;
    
    /*Receiver*/
    public static final boolean ChatSDKReceiver = true;



    public static final boolean NotificationUtils = true;
}
